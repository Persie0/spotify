package p204p;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lec1 {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f132515d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f132516a;

    /* JADX INFO: renamed from: b */
    public SparseArray f132517b;

    /* JADX INFO: renamed from: c */
    public WeakReference f132518c;

    /* JADX INFO: renamed from: a */
    public static lec1 m58776a(View view) {
        lec1 lec1Var = (lec1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (lec1Var != null) {
            return lec1Var;
        }
        lec1 lec1Var2 = new lec1();
        lec1Var2.f132516a = null;
        lec1Var2.f132517b = null;
        lec1Var2.f132518c = null;
        view.setTag(R.id.tag_unhandled_key_event_manager, lec1Var2);
        return lec1Var2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58777b(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f132516a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f132515d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f132516a == null) {
                            this.f132516a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f132515d;
                            View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f132516a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f132516a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewM58778c = m58778c(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM58778c != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f132517b == null) {
                    this.f132517b = new SparseArray();
                }
                this.f132517b.put(keyCode, new WeakReference(viewM58778c));
            }
        }
        return viewM58778c != null;
    }

    /* JADX INFO: renamed from: c */
    public final View m58778c(View view) {
        int size;
        WeakHashMap weakHashMap = this.f132516a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM58778c = m58778c(viewGroup.getChildAt(childCount));
                if (viewM58778c != null) {
                    return viewM58778c;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
