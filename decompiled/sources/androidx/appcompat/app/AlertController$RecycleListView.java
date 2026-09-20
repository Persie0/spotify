package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p204p.h3u0;

/* JADX INFO: loaded from: classes3.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f63a;

    /* JADX INFO: renamed from: b */
    public final int f64b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87340t);
        this.f64b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f63a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
