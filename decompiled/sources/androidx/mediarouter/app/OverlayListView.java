package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.ikc0;

/* JADX INFO: loaded from: classes3.dex */
final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1148a;

    public OverlayListView(Context context) {
        super(context);
        this.f1148a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1148a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1148a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1148a = new ArrayList();
    }
}
