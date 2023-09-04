ЗАДАНИЕ:

необходимо продемонстрировать изоляцию одного и того же приложения (как решено на семинаре - командного интерпретатора) в различных пространствах имен.

ВЫПОЛНЕНИЕ:

Изолированное выполнение процессов с помощью chroot и пространства имен в Linux:
- создать каталог "testfolder" в домашнем каталоге, скопировать в нее папку bin и библиотеки
- также необходимо  скопировать исполняемый файл "ls", и связанные с ними библиотеки
- запустить команду chroot для изменения корневой папки нашей текущей среды, теперь мы находимся в изолированной среде со своей файловой системой.

СПИСОК КОМАНД:

mkdir ~/testfolder

mkdir bin

cp /bin/bash ~/testfolder/bin

mkdir ~/testfolder/lib ~/testfolder/lib64

ldd bin/bash

cp /lib/x86_64-linux-gnu/libtinfo.so.6 ~/testfolder/lib

cp /lib/x86_64-linux-gnu/libc.so.6 ~/testfolder/lib

cp /lib64/ld-linux-x86-64.so.2 ~/testfolder/lib64/

cp /bin/ls ~/testfolder/bin/

cp /lib/x86_64-linux-gnu/libselinux.so.1 ~/testfolder/lib/

cp /lib/x86_64-linux-gnu/libpcre2-8.so.0 ~/testfolder/lib/

sudo chroot ~/testfolder 


![2023-09-04_15-36-44](https://github.com/zmgmarina/desktop-tutorial/assets/113174444/336264e4-94bc-42f5-9b00-58845965c733)

![2023-09-04_17-16-00](https://github.com/zmgmarina/desktop-tutorial/assets/113174444/84c0671e-4f7b-4e20-8019-92789d9f734e)




СОЗДАНИЕ ПРОСТРАНСТВА ИМЕН ДЛЯ СЕТИ:

- создадим пространство имен с именем "newtestns" для этого воспользуемся командой ip
- запустим процесс в созданном пространстве имен


 ip netns add newtestns
 ip netns exec testns bash

 ![2023-09-04 (2)](https://github.com/zmgmarina/desktop-tutorial/assets/113174444/931be998-38a3-48ce-8273-63fde72a1e33)
 

 - используя unshare можно углубить уровень изоляции

 sudo unshare --net --pid --fork --mount-proc /bin/bash

 
![Снимок экрана от 2023-09-04 17-43-56](https://github.com/zmgmarina/desktop-tutorial/assets/113174444/2610bdf9-9148-49f6-b93c-da5262873736)





