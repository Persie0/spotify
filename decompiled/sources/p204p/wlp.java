package p204p;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wlp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f252594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cmp f252595c;

    public /* synthetic */ wlp(cmp cmpVar, ArrayList arrayList, int i) {
        this.f252593a = i;
        this.f252595c = cmpVar;
        this.f252594b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f252593a) {
            case 0:
                ArrayList arrayList = this.f252594b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    cmp cmpVar = this.f252595c;
                    if (!zHasNext) {
                        arrayList.clear();
                        cmpVar.f39750m.remove(arrayList);
                    } else {
                        bmp bmpVar = (bmp) it.next();
                        dkv0 dkv0Var = bmpVar.f28588a;
                        int i = bmpVar.f28589b;
                        int i2 = bmpVar.f28590c;
                        int i3 = bmpVar.f28591d;
                        int i4 = bmpVar.f28592e;
                        View view = dkv0Var.f50039a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        cmpVar.f39753p.add(dkv0Var);
                        viewPropertyAnimatorAnimate.setDuration(cmpVar.f144349e).setListener(new ylp(cmpVar, dkv0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = this.f252594b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    cmp cmpVar2 = this.f252595c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        cmpVar2.f39749l.remove(arrayList2);
                    } else {
                        dkv0 dkv0Var2 = (dkv0) it2.next();
                        View view2 = dkv0Var2.f50039a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        cmpVar2.f39752o.add(dkv0Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(cmpVar2.f144347c).setListener(new xlp(cmpVar2, dkv0Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
