package com.nplix.datamodeltutorial;

import android.arch.lifecycle.ViewModel;

/**
 * Created by PK on 1/8/2018.
 */

public class ClickMeViewModel extends ViewModel {
    private Integer clickCount;

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}
