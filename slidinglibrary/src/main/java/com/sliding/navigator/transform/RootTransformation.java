package com.sliding.navigator.transform;

import android.view.View;

/**
 * Created by yarolegovich on 25.03.2017.
 */

public interface RootTransformation {

    void transform(float dragProgress, View rootView);
}
