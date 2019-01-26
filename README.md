# ComeAcrossFood
Inspiration

This is the process, not finished yet.


// rotation animation

// res/anim/rotate_picture.xml
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android" 
    android:shareInterpolator="false">
    <rotate 
		android:fromDegrees="0"
		android:toDegrees="360"
		android:duration="5000"
		android:pivotX="50%"
		android:pivotY="50%">
	</rotate>
</set>

Animation rotate = AnimationUtils.loadAnimation([this, R.anim.rotate_picture);
splash.startAnimation(rotate);


// another way
RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
anim.setInterpolator(new LinearInterpolator());
anim.setRepeatCount(Animation.INFINITE);
anim.setDuration(700);

// Start animating the image
final ImageView splash = (ImageView) findViewById(R.id.splash);
splash.startAnimation(anim);

// Later.. stop the animation
splash.setAnimation(null);


// gradient

// res/drawable/gradient_background_main
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:angle="90"
        android:endColor="@color/colorPrimaryText"
        android:startColor="@color/colorPrimary"
        android:type="linear" />
</shape>

android:background="@drawable/gradient_background_main"

// Transparent colour
app:cardBackgroundColor="@android:color/transparent" // for CardView

android:background="@android:color/transparent" 


// StacklayoutManager
// https://github.com/LittleMango/StackLayoutManager

implementation 'com.littlemango:stacklayoutmanager:1.0.5'

val orientation = StackLayoutManager.ScrollOrientation.LEFT_TO_RIGHT
val manager = StackLayoutManager(orientation)

val manager = StackLayoutManager()
recyclerView.layoutManager = manager


// TextView and Spinner(dropdown) at the center of Toolbar
<android.support.v7.widget.Toolbar
        android:id="@+id/tool_bar_main"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="?attr/colorPrimary"
        android:fitsSystemWindows="true"
        android:gravity="center"
        app:layout_collapseMode="pin"
        app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
        app:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal"
            android:gravity="center">
			
			<TextView
				android:id="@+id/txt_title_text"
				android:layout_width="wrap_content"
				android:layout_height="wrap_content"
				android:text="Menu"/>

            <Spinner
                android:id="@+id/spinner_address_name"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginEnd="16dp"
                android:layout_marginLeft="16dp"
                android:layout_marginRight="16dp"
                android:layout_marginStart="16dp"
                android:spinnerStyle="@android:style/Widget.Spinner.DropDown">

            </Spinner>

        </LinearLayout>

</android.support.v7.widget.Toolbar>


// Button with text and icon
<Button
    android:id="@+id/bSearch"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:padding="16dp"
    android:text="Search"
    android:drawableLeft="@android:drawable/ic_menu_search"
    android:textSize="24sp"/>
	
android:drawableLeft	||	android:drawableStart
android:drawableRight	||	android:drawableEnd
android:drawableTop
android:drawableBottom

setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom)
Button search = (Button) findViewById(R.id.yoursearchbutton);
search.setCompoundDrawables('your_drawable',null,null,null);


// adding and referencing a string in a string array
<string name="earth">Earth</string>
<string name="moon">Moon</string>

<string-array name="system">
    <item>@string/earth</item>
    <item>@string/moon</item>
</string-array>

String[] some_array = getResources().getStringArray(R.array.your_string_array)

getResources().getStringArray(R.array.your_array)[position]

// another way
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="my_books">
        <item>Scala Cookbook</item>
        <item>Play Framework Recipes</item>
        <item>How I Sold My Business: A Personal Diary</item>
        <item>A Survival Guide for New Consultants</item>
    </string-array>
</resources>

Resources res = getResources();
String[] myBooks = res.getStringArray(R.array.my_books);


// ListPreference
<resources>
    <string-array name="listArray">
        <item>Headings</item>
        <item>Headings and Details</item>
        <item>All Data</item>
    </string-array>
    <string-array name="listValues">
        <item>1</item>
        <item>2</item>
        <item>3</item>
    </string-array>
</resources>

<ListPreference android:title="Download Details"
                android:summary="Select the kind of data that you would like to download"
                android:key="downloadType"
                android:defaultValue="1"
                android:entries="@array/listArray"
                android:entryValues="@array/listValues" />
