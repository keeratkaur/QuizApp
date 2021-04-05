package com.keerat.quizapp

object Constants{

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1=Question(1,"Identify The personality",
            R.drawable.ic_kalam_sir,
            " CV Raman.",
            "Dr. A. P. J. Abdul Kalam",
            "Srinivasa Ramanujan",
            "Subhas Chandra Bose",
            2)

        questionsList.add(que1)
        //2
        val que2=Question(2,"This famous statue located in New York City is referred to as:",
            R.drawable.ic_statueliberty,
            " Spring Temple Buddha",
            "Christ the Redeemer",
            "Lion-man",
            "Statue of Liberty",
            4)

        questionsList.add(que2)
        //3
        val que3=Question(3,"This is longest wall in the world and has a main-line length of 3,460 km (2,150 miles – nearly three times the length of Britain – plus 3,530 km (2,193 miles) of branches and spurs.",
            R.drawable.ic_greatwallofchina,
            " Kumbhalgarh Fort",
            "Great Wall Of China",
            "Amer Fort Jaipur",
            "Ancient Walls of Mesopotamia",
            2)

        questionsList.add(que3)
        //4
        val que4=Question(4,"In 1632 the emperor, Shah Jahan instructed to build a tomb for his favorite wife, Mumtaz Mahal. They used 20,000 workers and 1000 elephants.",
            R.drawable.ic_tajmahal,
            " The Red Taj",
            "Mizo Taj\n",
            "Bibi Ka Maqbara" ,
            "The Taj Mahal",
            4
            )

        questionsList.add(que4)
        //5
        val que5=Question(5,"The opera house was designed by Jørn Utzon from Denmark and it was built between 1959 and 1973, with over 1 million roof tiles.",
            R.drawable.ic_que4,
            "Teatro di San Carlo",
            "Guangzhou Drama Arts Center",
            "Sydney Opera House",
            "Bunkamura Orchard Hall",
            3)

        questionsList.add(que5)
        //6
        val que6=Question(6,"Which major festival in India signifies the victory of light over darkness?",
            R.drawable.ic_que6,
            " Ramadan",
            " Diwali",
            "Holi",
            "Durga Pooja",
            2)

        questionsList.add(que6)
        //7
        val que7=Question(7," What is the Name of this Indian Historical Building Image ?",
            R.drawable.ic_que7,
            " Jaigarh Fort" ,
            "Amer Fort" ,
            "Tirumala Venkateswara Temple",
            "Jagannath Temple",

            1)

        questionsList.add(que7)
        //8
        val que8=Question(8," What is the Name of this Indian Historical Building Image ?",
            R.drawable.que8,
            " Red Fort" ,
                    "Agra Fort" ,
                    "Amer Fort" ,
                    "Jaigarh Fort",

            3)

        questionsList.add(que8)
        //9
        val que9=Question(9,"Can you identify the brand based on the logo?",
            R.drawable.que9,
            " Pepsi",
            "Wikipedia",
            "KFC",
            "Pizza Hut",
            1)

        questionsList.add(que9)
        //10
        val que10=Question(10,"Identify The Flag",
            R.drawable.que10,
            " Denmark",
            "Turkey",
            "Vietnam",
            "Taiwan",
            3)

        questionsList.add(que10)
        return questionsList
    }
}