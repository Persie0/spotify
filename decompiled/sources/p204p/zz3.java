package p204p;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zz3 {

    /* JADX INFO: renamed from: a */
    public static final zz3 f287881a = new zz3();

    /* JADX INFO: renamed from: b */
    public static PointerIcon m97264b(Context context, i6q0 i6q0Var) {
        return i6q0Var instanceof km4 ? PointerIcon.getSystemIcon(context, ((km4) i6q0Var).f124046b) : PointerIcon.getSystemIcon(context, 1000);
    }

    /* JADX INFO: renamed from: a */
    public final void m97265a(View view, i6q0 i6q0Var) {
        PointerIcon pointerIconM97264b = m97264b(view.getContext(), i6q0Var);
        if (wj50.m88271j(view.getPointerIcon(), pointerIconM97264b)) {
            return;
        }
        view.setPointerIcon(pointerIconM97264b);
    }
}
