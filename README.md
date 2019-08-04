# AndroidDaggerSample
Android에 Dagger2를 적용한 샘플코드 입니다.

기본적인 MVVM 패턴에 맞게 Repository는 ViewModel에서만 접근 가능합니다.

Repository의 Beer는 Interface 구조를 가지기 때문에 @Bind를 이용했고, Car는 Constructor Inject을 이용해서 간편하게 선언했습니다.

TODO: Module과  Subcomponent를 학습하여 구조 업데이트