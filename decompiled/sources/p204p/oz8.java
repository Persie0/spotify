package p204p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class oz8 implements sgs, jz8, mu60 {

    /* JADX INFO: renamed from: A */
    public float f172161A;

    /* JADX INFO: renamed from: B */
    public BlurMaskFilter f172162B;

    /* JADX INFO: renamed from: a */
    public final Path f172163a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f172164b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f172165c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final zd70 f172166d = new zd70(1);

    /* JADX INFO: renamed from: e */
    public final zd70 f172167e;

    /* JADX INFO: renamed from: f */
    public final zd70 f172168f;

    /* JADX INFO: renamed from: g */
    public final zd70 f172169g;

    /* JADX INFO: renamed from: h */
    public final zd70 f172170h;

    /* JADX INFO: renamed from: i */
    public final RectF f172171i;

    /* JADX INFO: renamed from: j */
    public final RectF f172172j;

    /* JADX INFO: renamed from: k */
    public final RectF f172173k;

    /* JADX INFO: renamed from: l */
    public final RectF f172174l;

    /* JADX INFO: renamed from: m */
    public final RectF f172175m;

    /* JADX INFO: renamed from: n */
    public final Matrix f172176n;

    /* JADX INFO: renamed from: o */
    public final r9b0 f172177o;

    /* JADX INFO: renamed from: p */
    public final wn70 f172178p;

    /* JADX INFO: renamed from: q */
    public final d670 f172179q;

    /* JADX INFO: renamed from: r */
    public final whz f172180r;

    /* JADX INFO: renamed from: s */
    public oz8 f172181s;

    /* JADX INFO: renamed from: t */
    public oz8 f172182t;

    /* JADX INFO: renamed from: u */
    public List f172183u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f172184v;

    /* JADX INFO: renamed from: w */
    public final h591 f172185w;

    /* JADX INFO: renamed from: x */
    public boolean f172186x;

    /* JADX INFO: renamed from: y */
    public boolean f172187y;

    /* JADX INFO: renamed from: z */
    public zd70 f172188z;

    public oz8(r9b0 r9b0Var, wn70 wn70Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f172167e = new zd70(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f172168f = new zd70(mode2);
        zd70 zd70Var = new zd70(1);
        this.f172169g = zd70Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        zd70 zd70Var2 = new zd70();
        zd70Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.f172170h = zd70Var2;
        this.f172171i = new RectF();
        this.f172172j = new RectF();
        this.f172173k = new RectF();
        this.f172174l = new RectF();
        this.f172175m = new RectF();
        this.f172176n = new Matrix();
        this.f172184v = new ArrayList();
        this.f172186x = true;
        this.f172161A = 0.0f;
        this.f172177o = r9b0Var;
        this.f172178p = wn70Var;
        List list = wn70Var.f253091h;
        if (wn70Var.f253104u == 3) {
            zd70Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            zd70Var.setXfermode(new PorterDuffXfermode(mode));
        }
        ow4 ow4Var = wn70Var.f253092i;
        ow4Var.getClass();
        h591 h591Var = new h591(ow4Var);
        this.f172185w = h591Var;
        h591Var.m46674b(this);
        if (list != null && !list.isEmpty()) {
            d670 d670Var = new d670(list);
            this.f172179q = d670Var;
            Iterator it = d670Var.m35089l().iterator();
            while (it.hasNext()) {
                ((mz8) it.next()).m63235a(this);
            }
            for (mz8 mz8Var : this.f172179q.m35091n()) {
                m68627e(mz8Var);
                mz8Var.m63235a(this);
            }
        }
        wn70 wn70Var2 = this.f172178p;
        if (wn70Var2.f253103t.isEmpty()) {
            if (true != this.f172186x) {
                this.f172186x = true;
                this.f172177o.invalidateSelf();
                return;
            }
            return;
        }
        whz whzVar = new whz(wn70Var2.f253103t);
        this.f172180r = whzVar;
        whzVar.f148643b = true;
        whzVar.m63235a(new jz8() { // from class: p.nz8
            @Override // p204p.jz8
            /* JADX INFO: renamed from: a */
            public final void mo27895a() {
                oz8 oz8Var = this.f160035a;
                boolean z = oz8Var.f172180r.m88179k() == 1.0f;
                if (z != oz8Var.f172186x) {
                    oz8Var.f172186x = z;
                    oz8Var.f172177o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.f172180r.mo46515e()).floatValue() == 1.0f;
        if (z != this.f172186x) {
            this.f172186x = z;
            this.f172177o.invalidateSelf();
        }
        m68627e(this.f172180r);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f172177o.invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void mo25332c(Object obj, xh70 xh70Var) {
        this.f172185w.m46675c(obj, xh70Var);
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: d */
    public void mo25333d(RectF rectF, Matrix matrix, boolean z) {
        this.f172171i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m68628h();
        Matrix matrix2 = this.f172176n;
        matrix2.set(matrix);
        if (z) {
            List list = this.f172183u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((oz8) this.f172183u.get(size)).f172185w.m46677e());
                }
            } else {
                oz8 oz8Var = this.f172182t;
                if (oz8Var != null) {
                    matrix2.preConcat(oz8Var.f172185w.m46677e());
                }
            }
        }
        matrix2.preConcat(this.f172185w.m46677e());
    }

    /* JADX INFO: renamed from: e */
    public final void m68627e(mz8 mz8Var) {
        if (mz8Var == null) {
            return;
        }
        this.f172184v.add(mz8Var);
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        oz8 oz8Var = this.f172181s;
        wn70 wn70Var = this.f172178p;
        if (oz8Var != null) {
            lu60 lu60VarM59927a = lu60Var2.m59927a(oz8Var.f172178p.f253086c);
            if (lu60Var.m59928b(i, this.f172181s.f172178p.f253086c)) {
                arrayList.add(lu60VarM59927a.m59933g(this.f172181s));
            }
            if (lu60Var.m59932f(i, wn70Var.f253086c)) {
                this.f172181s.mo65558p(lu60Var, lu60Var.m59930d(i, this.f172181s.f172178p.f253086c) + i, arrayList, lu60VarM59927a);
            }
        }
        String str = wn70Var.f253086c;
        String str2 = wn70Var.f253086c;
        if (lu60Var.m59931e(i, str)) {
            if (!"__container".equals(str2)) {
                lu60Var2 = lu60Var2.m59927a(str2);
                if (lu60Var.m59928b(i, str2)) {
                    arrayList.add(lu60Var2.m59933g(this));
                }
            }
            if (lu60Var.m59932f(i, str2)) {
                mo65558p(lu60Var, lu60Var.m59930d(i, str2) + i, arrayList, lu60Var2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    @Override // p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        float f;
        RectF rectF;
        zd70 zd70Var;
        int i2;
        char c;
        Integer num;
        if (this.f172186x) {
            wn70 wn70Var = this.f172178p;
            if (wn70Var.f253105v) {
                return;
            }
            m68628h();
            Matrix matrix2 = this.f172164b;
            matrix2.reset();
            matrix2.set(matrix);
            int i3 = 1;
            for (int size = this.f172183u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((oz8) this.f172183u.get(size)).f172185w.m46677e());
            }
            h591 h591Var = this.f172185w;
            mz8 mz8Var = h591Var.f87783j;
            int iIntValue = (int) ((((i / 255.0f) * ((mz8Var == null || (num = (Integer) mz8Var.mo46515e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.f172181s == null && !m68630m()) {
                matrix2.preConcat(h591Var.m46677e());
                mo25334j(canvas, matrix2, iIntValue);
                m68631n();
                return;
            }
            RectF rectF2 = this.f172171i;
            mo25333d(rectF2, matrix2, false);
            int i4 = 3;
            if (this.f172181s != null && wn70Var.f253104u != 3) {
                RectF rectF3 = this.f172174l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f172181s.mo25333d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(h591Var.m46677e());
            RectF rectF4 = this.f172173k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM68630m = m68630m();
            int i5 = 2;
            d670 d670Var = this.f172179q;
            Path path = this.f172163a;
            if (zM68630m) {
                int size2 = d670Var.m35090m().size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        l1d0 l1d0Var = (l1d0) d670Var.m35090m().get(i6);
                        Path path2 = (Path) ((mz8) d670Var.m35089l().get(i6)).mo46515e();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            int iM38547C = edb.m38547C(l1d0Var.m57872a());
                            if (iM38547C != 0) {
                                if (iM38547C != i3) {
                                    if (iM38547C != i5) {
                                        if (iM38547C == i4) {
                                        }
                                        rectF = this.f172175m;
                                        path.computeBounds(rectF, false);
                                        if (i6 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                    }
                                }
                            }
                            if (l1d0Var.m57873b()) {
                            }
                            rectF = this.f172175m;
                            path.computeBounds(rectF, false);
                            if (i6 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                        }
                        i6++;
                        i3 = 1;
                        i5 = 2;
                        i4 = 3;
                    } else if (!rectF2.intersect(rectF4)) {
                        f = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f = 0.0f;
                    break;
                }
            } else {
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.f172172j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.f172165c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                zd70 zd70Var2 = this.f172166d;
                zd70Var2.setAlpha(255);
                qlo qloVar = x0b1.f256851a;
                canvas.saveLayer(rectF2, zd70Var2);
                m68629i(canvas);
                mo25334j(canvas, matrix2, iIntValue);
                if (m68630m()) {
                    zd70 zd70Var3 = this.f172167e;
                    canvas.saveLayer(rectF2, zd70Var3);
                    if (Build.VERSION.SDK_INT < 28) {
                        m68629i(canvas);
                    }
                    int i7 = 0;
                    while (i7 < d670Var.m35090m().size()) {
                        l1d0 l1d0Var2 = (l1d0) d670Var.m35090m().get(i7);
                        mz8 mz8Var2 = (mz8) d670Var.m35089l().get(i7);
                        mz8 mz8Var3 = (mz8) d670Var.m35091n().get(i7);
                        int iM38547C2 = edb.m38547C(l1d0Var2.m57872a());
                        zd70 zd70Var4 = this.f172168f;
                        if (iM38547C2 != 0) {
                            i2 = i7;
                            if (iM38547C2 != 1) {
                                if (iM38547C2 != 2) {
                                    if (iM38547C2 == 3 && !d670Var.m35089l().isEmpty()) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= d670Var.m35090m().size()) {
                                                zd70Var2.setAlpha(255);
                                                canvas.drawRect(rectF2, zd70Var2);
                                                break;
                                            } else if (((l1d0) d670Var.m35090m().get(i8)).m57872a() != 4) {
                                                break;
                                            } else {
                                                i8++;
                                            }
                                        }
                                    }
                                } else if (l1d0Var2.m57873b()) {
                                    qlo qloVar2 = x0b1.f256851a;
                                    canvas.saveLayer(rectF2, zd70Var3);
                                    canvas.drawRect(rectF2, zd70Var2);
                                    zd70Var4.setAlpha((int) (((Integer) mz8Var3.mo46515e()).intValue() * 2.55f));
                                    path.set((Path) mz8Var2.mo46515e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, zd70Var4);
                                    canvas.restore();
                                } else {
                                    qlo qloVar3 = x0b1.f256851a;
                                    canvas.saveLayer(rectF2, zd70Var3);
                                    path.set((Path) mz8Var2.mo46515e());
                                    path.transform(matrix2);
                                    zd70Var2.setAlpha((int) (((Integer) mz8Var3.mo46515e()).intValue() * 2.55f));
                                    canvas.drawPath(path, zd70Var2);
                                    canvas.restore();
                                }
                                c = 255;
                            } else {
                                if (i2 == 0) {
                                    zd70Var2.setColor(-16777216);
                                    c = 255;
                                    zd70Var2.setAlpha(255);
                                    canvas.drawRect(rectF2, zd70Var2);
                                } else {
                                    c = 255;
                                }
                                if (l1d0Var2.m57873b()) {
                                    qlo qloVar4 = x0b1.f256851a;
                                    canvas.saveLayer(rectF2, zd70Var4);
                                    canvas.drawRect(rectF2, zd70Var2);
                                    zd70Var4.setAlpha((int) (((Integer) mz8Var3.mo46515e()).intValue() * 2.55f));
                                    path.set((Path) mz8Var2.mo46515e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, zd70Var4);
                                    canvas.restore();
                                } else {
                                    path.set((Path) mz8Var2.mo46515e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, zd70Var4);
                                }
                            }
                        } else {
                            i2 = i7;
                            c = 255;
                            if (l1d0Var2.m57873b()) {
                                qlo qloVar5 = x0b1.f256851a;
                                canvas.saveLayer(rectF2, zd70Var2);
                                canvas.drawRect(rectF2, zd70Var2);
                                path.set((Path) mz8Var2.mo46515e());
                                path.transform(matrix2);
                                zd70Var2.setAlpha((int) (((Integer) mz8Var3.mo46515e()).intValue() * 2.55f));
                                canvas.drawPath(path, zd70Var4);
                                canvas.restore();
                            } else {
                                path.set((Path) mz8Var2.mo46515e());
                                path.transform(matrix2);
                                zd70Var2.setAlpha((int) (((Integer) mz8Var3.mo46515e()).intValue() * 2.55f));
                                canvas.drawPath(path, zd70Var2);
                            }
                        }
                        i7 = i2 + 1;
                    }
                    canvas.restore();
                }
                if (this.f172181s != null) {
                    canvas.saveLayer(rectF2, this.f172169g);
                    m68629i(canvas);
                    this.f172181s.mo27898g(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f172187y && (zd70Var = this.f172188z) != null) {
                zd70Var.setStyle(Paint.Style.STROKE);
                this.f172188z.setColor(-251901);
                this.f172188z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.f172188z);
                this.f172188z.setStyle(Paint.Style.FILL);
                this.f172188z.setColor(1357638635);
                canvas.drawRect(rectF2, this.f172188z);
            }
            m68631n();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m68628h() {
        if (this.f172183u != null) {
            return;
        }
        if (this.f172182t == null) {
            this.f172183u = Collections.EMPTY_LIST;
            return;
        }
        this.f172183u = new ArrayList();
        for (oz8 oz8Var = this.f172182t; oz8Var != null; oz8Var = oz8Var.f172182t) {
            this.f172183u.add(oz8Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m68629i(Canvas canvas) {
        RectF rectF = this.f172171i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f172170h);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo25334j(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: renamed from: k */
    public px0 mo66916k() {
        return this.f172178p.f253106w;
    }

    /* JADX INFO: renamed from: l */
    public u7n mo66917l() {
        return this.f172178p.f253107x;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m68630m() {
        d670 d670Var = this.f172179q;
        return (d670Var == null || d670Var.m35089l().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m68631n() {
        xln0 xln0Var = this.f172177o.f196988a.f227882a;
        String str = this.f172178p.f253086c;
        HashMap map = xln0Var.f263202c;
        if (xln0Var.f263200a) {
            g6d0 g6d0Var = (g6d0) map.get(str);
            if (g6d0Var == null) {
                g6d0Var = new g6d0();
                map.put(str, g6d0Var);
            }
            g6d0Var.m43686a();
            if (str.equals("__container")) {
                zj5 zj5Var = xln0Var.f263201b;
                zj5Var.getClass();
                sj5 sj5Var = new sj5(zj5Var);
                if (sj5Var.hasNext()) {
                    ikc0.m50942n(sj5Var.next());
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m68632o(mz8 mz8Var) {
        this.f172184v.remove(mz8Var);
    }

    /* JADX INFO: renamed from: q */
    public void mo65559q(boolean z) {
        if (z && this.f172188z == null) {
            this.f172188z = new zd70();
        }
        this.f172187y = z;
    }

    /* JADX INFO: renamed from: r */
    public void mo65560r(float f) {
        h591 h591Var = this.f172185w;
        mz8 mz8Var = h591Var.f87783j;
        if (mz8Var != null) {
            mz8Var.mo46517i(f);
        }
        mz8 mz8Var2 = h591Var.f87786m;
        if (mz8Var2 != null) {
            mz8Var2.mo46517i(f);
        }
        mz8 mz8Var3 = h591Var.f87787n;
        if (mz8Var3 != null) {
            mz8Var3.mo46517i(f);
        }
        mz8 mz8Var4 = h591Var.f87779f;
        if (mz8Var4 != null) {
            mz8Var4.mo46517i(f);
        }
        mz8 mz8Var5 = h591Var.f87780g;
        if (mz8Var5 != null) {
            mz8Var5.mo46517i(f);
        }
        mz8 mz8Var6 = h591Var.f87781h;
        if (mz8Var6 != null) {
            mz8Var6.mo46517i(f);
        }
        mz8 mz8Var7 = h591Var.f87782i;
        if (mz8Var7 != null) {
            mz8Var7.mo46517i(f);
        }
        whz whzVar = h591Var.f87784k;
        if (whzVar != null) {
            whzVar.mo46517i(f);
        }
        whz whzVar2 = h591Var.f87785l;
        if (whzVar2 != null) {
            whzVar2.mo46517i(f);
        }
        int i = 0;
        d670 d670Var = this.f172179q;
        if (d670Var != null) {
            for (int i2 = 0; i2 < d670Var.m35089l().size(); i2++) {
                ((mz8) d670Var.m35089l().get(i2)).mo46517i(f);
            }
        }
        whz whzVar3 = this.f172180r;
        if (whzVar3 != null) {
            whzVar3.mo46517i(f);
        }
        oz8 oz8Var = this.f172181s;
        if (oz8Var != null) {
            oz8Var.mo65560r(f);
        }
        while (true) {
            ArrayList arrayList = this.f172184v;
            if (i >= arrayList.size()) {
                return;
            }
            ((mz8) arrayList.get(i)).mo46517i(f);
            i++;
        }
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
    }

    /* JADX INFO: renamed from: p */
    public void mo65558p(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
    }
}
