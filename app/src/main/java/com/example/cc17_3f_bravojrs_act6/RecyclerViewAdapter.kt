// RecyclerViewAdapter.kt
package com.example.cc17_3f_bravojrs_act6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemImages = intArrayOf(
        R.drawable.day1_meditation,
        R.drawable.day2_read,
        R.drawable.day3_exercise,
        R.drawable.day4_strolling,
        R.drawable.day5_cook,
        R.drawable.day6_study,
        R.drawable.day7_cleaninghouse,
        R.drawable.day8_journaling,
        R.drawable.day9_sunviewing,
        R.drawable.day10_jogging,
        R.drawable.day11_watchtv,
        R.drawable.day12_shop,
        R.drawable.day13,
        R.drawable.day14_learn,
        R.drawable.day15_family,
        R.drawable.day16_takepictures,
        R.drawable.day17_volunteer,
        R.drawable.day18_friends,
        R.drawable.day19_sleep,
        R.drawable.day20_explore,
        R.drawable.day21_online,
        R.drawable.day22_visit,
        R.drawable.day23_party,
        R.drawable.day24_hike,
        R.drawable.day25_boardgames,
        R.drawable.day26_playlist,
        R.drawable.day27_recipe,
        R.drawable.day28_gardening,
        R.drawable.day29_diary,
        R.drawable.day30_reflect

        )

    private val itemTitles = arrayOf(
        "Day 1: Meditation",
        "Day 2: Read Books",
        "Day 3: Exercise",
        "Day 4: Stroll in a Park",
        "Day 5: Cook my favorite food",
        "Day 6: Study",
        "Day 7: Clean the house",
        "Day 8: Journaling",
        "Day 9: Sun Viewing",
        "Day 10: Jogging",
        "Day 11: Watch my favorite TV shows",
        "Day 12: Outside shopping",
        "Day 13: Eat healthy foods",
        "Day 14: Learn new things",
        "Day 15: Spend time with my family",
        "Day 16: Take a picture of the scenery",
        "Day 17: Donate in small organizations",
        "Day 18: Spend time with friends",
        "Day 19: Rest and Sleep for 8-10 hours",
        "Day 20: Explore interesting and new things ",
        "Day 21: Gain knowledge through online resources ",
        "Day 22: Visit new places",
        "Day 23: Attend different parties ",
        "Day 24: Mountain hike",
        "Day 25: Play different board games with loved ones ",
        "Day 26: Create new music playlist",
        "Day 27: Experiment a new food recipe",
        "Day 28: Water plants in our garden",
        "Day 29: Journalize",
        "Day 30: Reflect"

    )

    private val itemDescriptions = arrayOf(
        "Day 1 introduces mindfulness meditation by focusing on my breath to cultivate calm and presence.",
        "Day 2: Pick a time to enjoy some quiet reading each day. Start with just a few minutes and let the habit grow naturally.",
        "Day 3: Get moving with a simple exercise routine today. Even a short walk or stretching can boost my energy and mood.",
        "Day 4: Take a relaxing stroll in the park today. Enjoy the fresh air and let nature refresh my mind and body.",
        "Day 5: Today, I’m cooking my favorite meal. I’m taking my time, enjoying the process, and can’t wait to dig in!",
        "Day 6: I’m dedicating some time today to study. I’ll find a cozy spot, focus, and enjoy the journey of learning something new.",
        "Day 7: Today, I’m cleaning the house. It feels great to declutter my space and create a fresh, inviting environment!",
        "Day 8: I’m journaling my thoughts and feelings today. It’s a chance to reflect and connect with myself on a deeper level.",
        "Day 9: Today, I’m enjoying some time in the sun. It'll soak up the warmth and let its light brighten my mood.",
        "Day 10: I’m going for a jog today to clear my mind and get my blood pumping. It’s a refreshing way to boost my energy and enjoy the outdoors!",
        "Day 11: Today, I’m unwinding by binge-watching my favorite TV shows. It’s the perfect way to relax!",
        "Day 12: I’m heading out for some outdoor shopping today. I’ll enjoy the fresh air while exploring and finding a few treats for myself!",
        "Day 13: Today, I’m focusing on eating healthy foods. I’ll savor vibrant fruits and veggies, nourishing my body with every bite!",
        "Day 14: Today, I’m diving into something new and exciting. Whether it’s a skill or a topic, I can’t wait to expand my horizons!",
        "Day 15: Today is all about family! I’m excited to spend quality time with my loved ones, sharing laughs and creating new memories together.",
        "Day 16: Today, I’m capturing the beauty around me by taking pictures of the scenery. It’s a lovely way to appreciate nature",
        "Day 17: Today, I'm donating things I no longer use to small organizations. It feels great to declutter and help others",
        "Day 18: I’m spending time with friends today, enjoying laughter and good company. It's the perfect way to recharge and create happy memories!",
        "Day 19: Today, I'm aiming for 8 to 10 hours of sleep. It’s time to recharge and give my body the break it deserves!",
        "Day 20: I’m setting out to explore new and interesting things today.  I’m excited to discover what’s out there!",
        "Day 21: I’m diving into new knowledge today by exploring online resources like articles or videos. I can’t wait to expand my horizons!",
        "Day 22: I’m off to explore new places today that I haven’t visited yet. It’s exciting to discover fresh sights and create new memories!",
        "Day 23: I’m attending a birthday party today, ready to celebrate with friends and enjoy some fun moments. It’s a great way to connect and create lasting memories!",
        "Day 24: I’m going for a mountain hike today to connect with nature. I can't wait to enjoy the fresh air and stunning views along the trail!",
        "Day 25: Today, I’m playing board games with my loved ones. It’s a wonderful way to laugh and bond",
        "Day 26: I’m curating a new music playlist that matches my mood today. It’ll be a fun way to express myself.",
        "Day 27: Today, I’m experimenting in the kitchen to create a new recipe. I love the thrill of trying new flavors",
        "Day 28: I’m watering the plants in my garden today. It’s so satisfying to nurture them and watch them thrive!",
        "Day 29: I’m taking time to journal about everything I’ve done in the past few days. Reflecting on these moments will help me cherish the memories and see how far I’ve come!",
        "Day 30: Today, I’m reflecting on my journey over the past 30 days. I’ve embraced mindfulness, explored new activities, and nurtured my well-being.")

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var day_image : ImageView
        var day_title : TextView
        var day_desc : TextView

        init{
            day_image = itemView.findViewById(R.id.day_image)
            day_title = itemView.findViewById(R.id.day_title)
            day_desc = itemView.findViewById(R.id.day_desc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.day_image.setImageResource(itemImages[position])
        holder.day_title.text = itemTitles [position]
        holder.day_desc.text = itemDescriptions [position]

        holder.itemView.setOnClickListener {v: View ->

            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }

    }
}









