   data class User(
       var username: String,
       var email: String,
       var age: Int,
       var password: Int
   ):Verifiable{


       override fun verify(user: User) {
           if (this == user) {
               println("Вход был успешно!")
           } else{
               throw IllegalAccessException("Неверныйе данные для входа!")
           }
       }
   }


