package p204p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class zi80 implements xi80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283116a;

    @Override // p204p.xi80
    /* JADX INFO: renamed from: a */
    public final float mo91106a(ViewGroup viewGroup, List list, View view) {
        switch (this.f283116a) {
            case 0:
                return (viewGroup.getLayoutDirection() == 1 ? aj80.f16187i1 : aj80.f16190l1).mo91106a(viewGroup, list, view);
            case 1:
                float translationX = view.getTranslationX();
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int right = ((View) it.next()).getRight();
                while (it.hasNext()) {
                    int right2 = ((View) it.next()).getRight();
                    if (right < right2) {
                        right = right2;
                    }
                }
                return translationX - right;
            case 2:
                float translationX2 = view.getTranslationX();
                int width = viewGroup.getWidth();
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int left = ((View) it2.next()).getLeft();
                while (it2.hasNext()) {
                    int left2 = ((View) it2.next()).getLeft();
                    if (left > left2) {
                        left = left2;
                    }
                }
                return translationX2 + (width - left);
            default:
                return (viewGroup.getLayoutDirection() == 1 ? aj80.f16190l1 : aj80.f16187i1).mo91106a(viewGroup, list, view);
        }
    }
}
