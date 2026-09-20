package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p204p.lie0;
import p204p.zge0;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuView extends RecyclerView implements lie0 {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p204p.lie0
    /* JADX INFO: renamed from: b */
    public final void mo74b(zge0 zge0Var) {
    }
}
