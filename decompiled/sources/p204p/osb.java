package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class osb extends View implements jx51 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f168784a;

    /* JADX INFO: renamed from: b */
    public List f168785b;

    /* JADX INFO: renamed from: c */
    public float f168786c;

    /* JADX INFO: renamed from: d */
    public dvb f168787d;

    /* JADX INFO: renamed from: e */
    public float f168788e;

    public osb(Context context, int i) {
        super(context, null);
        this.f168784a = new ArrayList();
        this.f168785b = Collections.EMPTY_LIST;
        this.f168786c = 0.0533f;
        this.f168787d = dvb.f53409g;
        this.f168788e = 0.08f;
    }

    @Override // p204p.jx51
    /* JADX INFO: renamed from: a */
    public final void mo54496a(List list, dvb dvbVar, float f, float f2) {
        this.f168785b = list;
        this.f168787d = dvbVar;
        this.f168786c = f;
        this.f168788e = f2;
        while (true) {
            ArrayList arrayList = this.f168784a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new fw51(getContext()));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.f168785b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fM61855H = mif1.m61855H(this.f168786c, 0, height, i);
        if (fM61855H <= 0.0f) {
            return;
        }
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            b0m b0mVarM24368a = (b0m) list.get(i2);
            if (b0mVarM24368a.f21982p != Integer.MIN_VALUE) {
                a0m a0mVarM27841a = b0mVarM24368a.m27841a();
                float f = b0mVarM24368a.f21971e;
                a0mVarM27841a.f11110h = -3.4028235E38f;
                a0mVarM27841a.f11111i = Integer.MIN_VALUE;
                a0mVarM27841a.f11105c = null;
                if (b0mVarM24368a.f21972f == 0) {
                    a0mVarM27841a.f11107e = 1.0f - f;
                    a0mVarM27841a.f11108f = 0;
                } else {
                    a0mVarM27841a.f11107e = (-f) - 1.0f;
                    a0mVarM27841a.f11108f = 1;
                }
                int i3 = b0mVarM24368a.f21973g;
                if (i3 == 0) {
                    a0mVarM27841a.f11109g = 2;
                } else if (i3 == 2) {
                    a0mVarM27841a.f11109g = 0;
                }
                b0mVarM24368a = a0mVarM27841a.m24368a();
            }
            ((fw51) this.f168784a.get(i2)).m42940a(b0mVarM24368a, this.f168787d, fM61855H, mif1.m61855H(b0mVarM24368a.f21981o, b0mVarM24368a.f21980n, height, i), this.f168788e, canvas, paddingLeft, paddingTop, width, paddingBottom);
            i2++;
        }
    }
}
