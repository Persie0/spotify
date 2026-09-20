package p204p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class yi80 implements xi80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273062a;

    @Override // p204p.xi80
    /* JADX INFO: renamed from: b */
    public final float mo91107b(ViewGroup viewGroup, ArrayList arrayList, View view) {
        switch (this.f273062a) {
            case 0:
                float translationY = view.getTranslationY();
                int height = viewGroup.getHeight();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int top = ((View) it.next()).getTop();
                while (it.hasNext()) {
                    int top2 = ((View) it.next()).getTop();
                    if (top > top2) {
                        top = top2;
                    }
                }
                return translationY + (height - top);
            default:
                float translationY2 = view.getTranslationY();
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int bottom = ((View) it2.next()).getBottom();
                while (it2.hasNext()) {
                    int bottom2 = ((View) it2.next()).getBottom();
                    if (bottom < bottom2) {
                        bottom = bottom2;
                    }
                }
                return translationY2 - bottom;
        }
    }
}
