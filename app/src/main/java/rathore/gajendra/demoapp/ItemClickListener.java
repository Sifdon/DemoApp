package rathore.gajendra.demoapp;

/**
 * Created by user on 29-01-2017.
 */

import android.view.View;

public interface ItemClickListener {

    void onClick(View view, int position, boolean isLongClick);
}