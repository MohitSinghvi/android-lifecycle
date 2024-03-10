CMPE-277 – Assignment 1:

Activity Lifecycle

In this application, We have incremented the thread counter whenever the Main Activity restarts to demonstrate that when a new activity (Activity B, Activity C) is opened and we go back to the previous activity, onRestart() method is called. We increment the thread counter by 5.

On the other hand, when a dialog Activity is opened, and we go back to the previous activity, onRestart() method is not called, so the thread counter remains unchanged.

Home screen:

<img width="201" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/cd4c37c5-bb54-44a7-a8f7-4687e90af37f">

</br>

Activity B opened:
</br>
<img width="200" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/a59dc0b3-a471-40cc-a2c0-440c61a62fab">
</br>
Count incremented by 5:
</br>
<img width="222" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/646f3ebd-e616-4909-9a58-a397ff19dde6">
</br>
</br>
Activity C opened:
</br>
<img width="222" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/a4d21505-ec99-4cbf-b17b-0d437099d29b">
</br>
Count incremented to 10:
</br>
</br>

<img width="232" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/d9838b37-9f7f-4e9c-b28f-9b94dbe3ac8e">

</br>
Dialog opened:
</br>
</br>
<img width="231" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/3542dad9-df8b-43a0-9f9d-784b765ad661">
</br>
Count remains unchanged:
</br>
</br>
<img width="232" alt="image" src="https://github.com/MohitSinghvi/android-lifecycle/assets/35193178/910d5333-7a50-4d6e-891c-30e00df6faf5">






