package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p204p.C2212of;
import p204p.bd61;
import p204p.eqk;
import p204p.gc41;
import p204p.mec1;
import p204p.s5f1;
import p204p.vec1;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends eqk {

    /* JADX INFO: renamed from: a */
    public vec1 f1997a;

    /* JADX INFO: renamed from: b */
    public s5f1 f1998b;

    /* JADX INFO: renamed from: c */
    public boolean f1999c;

    /* JADX INFO: renamed from: d */
    public int f2000d = 2;

    /* JADX INFO: renamed from: e */
    public float f2001e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f2002f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final bd61 f2003g = new bd61(this);

    @Override // p204p.eqk
    /* JADX INFO: renamed from: g */
    public boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM376q = this.f1999c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM376q = coordinatorLayout.m376q(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1999c = zM376q;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1999c = false;
        }
        if (!zM376q) {
            return false;
        }
        if (this.f1997a == null) {
            this.f1997a = new vec1(coordinatorLayout.getContext(), coordinatorLayout, this.f2003g);
        }
        return this.f1997a.m85315q(motionEvent);
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = mec1.f142677a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            mec1.m61560l(view, 1048576);
            mec1.m61556h(view, 0);
            if (mo1564t(view)) {
                mec1.m61561m(view, C2212of.f164599o, null, new gc41(this, 7));
            }
        }
        return false;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: s */
    public boolean mo1563s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        vec1 vec1Var = this.f1997a;
        if (vec1Var == null) {
            return false;
        }
        vec1Var.m85308j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo1564t(View view) {
        return true;
    }
}
