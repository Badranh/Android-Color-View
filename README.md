# Android-Color-View
Educational Purpose Project
Made it on the go while I was doing an e commerce project , feel free to make it better :) or learn from it 

# Example
Colors can be modified as you want with onClickListener

![Screenshot](https://i.imgur.com/M15Y6ri.png)

# How to add to your app 

add this to your dependencies in build.gradle file
```
implementation 'com.github.Badranh:Android-Color-View:1.3'
```
Add it in your root build.gradle at the end of repositories:

```
allprojects {
   repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
# Sample Code

```
RecyclerView color_rec_view;
color_rec_view = findViewById(R.id.color_rec_view);
LinearLayoutManager llm = new LinearLayoutManager(this);
llm.setOrientation(LinearLayoutManager.HORIZONTAL);
color_rec_view.setLayoutManager(llm);
ColorAdapter adapter = new ColorAdapter(new String[]{"#123123", "#9fa132","#123123","#9123bc","#abcdef"},new            ColorAdapter.onCardClick() {
            @Override
            public void onClickCallBack() {
                Toast.makeText(getBaseContext(),"clicked color",Toast.LENGTH_LONG).show();
            }
        });
color_rec_view.setAdapter(adapter);
color_rec_view.forceLayout();
color_rec_view.hasFixedSize();
```

# In XML
```
<android.support.v7.widget.RecyclerView
 android:id="@+id/color_rec_view"
 android:layout_width="wrap_content"
 android:layout_height="match_parent"
 android:layout_centerHorizontal="true"
/>
```
