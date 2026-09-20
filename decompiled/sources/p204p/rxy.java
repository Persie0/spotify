package p204p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rxy implements sgs, jz8, nu60 {

    /* JADX INFO: renamed from: a */
    public final Path f203748a;

    /* JADX INFO: renamed from: b */
    public final zd70 f203749b;

    /* JADX INFO: renamed from: c */
    public final oz8 f203750c;

    /* JADX INFO: renamed from: d */
    public final String f203751d;

    /* JADX INFO: renamed from: e */
    public final boolean f203752e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f203753f;

    /* JADX INFO: renamed from: g */
    public final q7f f203754g;

    /* JADX INFO: renamed from: h */
    public final q7f f203755h;

    /* JADX INFO: renamed from: i */
    public h3b1 f203756i;

    /* JADX INFO: renamed from: j */
    public final r9b0 f203757j;

    /* JADX INFO: renamed from: k */
    public mz8 f203758k;

    /* JADX INFO: renamed from: l */
    public float f203759l;

    /* JADX INFO: renamed from: m */
    public final whs f203760m;

    public rxy(r9b0 r9b0Var, oz8 oz8Var, jh01 jh01Var) {
        Path path = new Path();
        this.f203748a = path;
        zd70 zd70Var = new zd70(1);
        this.f203749b = zd70Var;
        this.f203753f = new ArrayList();
        this.f203750c = oz8Var;
        String str = jh01Var.f112305c;
        hw4 hw4Var = jh01Var.f112307e;
        hw4 hw4Var2 = jh01Var.f112306d;
        this.f203751d = str;
        this.f203752e = jh01Var.f112308f;
        this.f203757j = r9b0Var;
        if (oz8Var.mo66916k() != null) {
            mz8 mz8VarMo48914j0 = ((iw4) oz8Var.mo66916k().f182174b).mo48914j0();
            this.f203758k = mz8VarMo48914j0;
            mz8VarMo48914j0.m63235a(this);
            oz8Var.m68627e(this.f203758k);
        }
        if (oz8Var.mo66917l() != null) {
            this.f203760m = new whs(this, oz8Var, oz8Var.mo66917l());
        }
        if (hw4Var2 == null) {
            this.f203754g = null;
            this.f203755h = null;
            return;
        }
        int iM62795b = mt60.m62795b(oz8Var.f172178p.f253108y);
        int i = kqm0.f125350a;
        if (Build.VERSION.SDK_INT >= 29) {
            lzj.m60352b0(zd70Var, iM62795b != 0 ? lzj.m60342T(iM62795b) : null);
        } else if (iM62795b != 0) {
            PorterDuff.Mode modeM93076x = y85.m93076x(iM62795b);
            zd70Var.setXfermode(modeM93076x != null ? new PorterDuffXfermode(modeM93076x) : null);
        } else {
            zd70Var.setXfermode(null);
        }
        path.setFillType(jh01Var.f112304b);
        mz8 mz8VarMo48914j1 = hw4Var2.mo48914j0();
        this.f203754g = (q7f) mz8VarMo48914j1;
        mz8VarMo48914j1.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j1);
        mz8 mz8VarMo48914j2 = hw4Var.mo48914j0();
        this.f203755h = (q7f) mz8VarMo48914j2;
        mz8VarMo48914j2.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j2);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f203757j.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            hej hejVar = (hej) list2.get(i);
            if (hejVar instanceof ybn0) {
                this.f203753f.add((ybn0) hejVar);
            }
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        PointF pointF = bab0.f25146a;
        if (obj == 1) {
            this.f203754g.m63238j(xh70Var);
            return;
        }
        if (obj == 4) {
            this.f203755h.m63238j(xh70Var);
            return;
        }
        ColorFilter colorFilter = bab0.f25140F;
        oz8 oz8Var = this.f203750c;
        if (obj == colorFilter) {
            h3b1 h3b1Var = this.f203756i;
            if (h3b1Var != null) {
                oz8Var.m68632o(h3b1Var);
            }
            if (xh70Var == null) {
                this.f203756i = null;
                return;
            }
            h3b1 h3b1Var2 = new h3b1(null, xh70Var);
            this.f203756i = h3b1Var2;
            h3b1Var2.m63235a(this);
            oz8Var.m68627e(this.f203756i);
            return;
        }
        if (obj == bab0.f25150e) {
            mz8 mz8Var = this.f203758k;
            if (mz8Var != null) {
                mz8Var.m63238j(xh70Var);
                return;
            }
            h3b1 h3b1Var3 = new h3b1(null, xh70Var);
            this.f203758k = h3b1Var3;
            h3b1Var3.m63235a(this);
            oz8Var.m68627e(this.f203758k);
            return;
        }
        whs whsVar = this.f203760m;
        if (obj == 5 && whsVar != null) {
            whsVar.m88168c(xh70Var);
            return;
        }
        if (obj == bab0.f25136B && whsVar != null) {
            whsVar.m88171f(xh70Var);
            return;
        }
        if (obj == bab0.f25137C && whsVar != null) {
            whsVar.m88169d(xh70Var);
            return;
        }
        if (obj == bab0.f25138D && whsVar != null) {
            whsVar.m88170e(xh70Var);
        } else {
            if (obj != bab0.f25139E || whsVar == null) {
                return;
            }
            whsVar.m88172g(xh70Var);
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: d */
    public final void mo25333d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f203748a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f203753f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((ybn0) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        eff0.m38736f(lu60Var, i, arrayList, lu60Var2, this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.f203752e) {
            return;
        }
        int iM72288k = this.f203754g.m72288k();
        int iIntValue = (int) ((((i / 255.0f) * ((Integer) this.f203755h.mo46515e()).intValue()) / 100.0f) * 255.0f);
        PointF pointF = eff0.f59045a;
        int i2 = 0;
        int iMax = (Math.max(0, Math.min(255, iIntValue)) << 24) | (iM72288k & 16777215);
        zd70 zd70Var = this.f203749b;
        zd70Var.setColor(iMax);
        h3b1 h3b1Var = this.f203756i;
        if (h3b1Var != null) {
            zd70Var.setColorFilter((ColorFilter) h3b1Var.mo46515e());
        }
        mz8 mz8Var = this.f203758k;
        if (mz8Var != null) {
            float fFloatValue = ((Float) mz8Var.mo46515e()).floatValue();
            if (fFloatValue == 0.0f) {
                zd70Var.setMaskFilter(null);
            } else if (fFloatValue != this.f203759l) {
                oz8 oz8Var = this.f203750c;
                if (oz8Var.f172161A == fFloatValue) {
                    blurMaskFilter = oz8Var.f172162B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    oz8Var.f172162B = blurMaskFilter2;
                    oz8Var.f172161A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                zd70Var.setMaskFilter(blurMaskFilter);
            }
            this.f203759l = fFloatValue;
        }
        whs whsVar = this.f203760m;
        if (whsVar != null) {
            whsVar.m88167b(zd70Var);
        }
        Path path = this.f203748a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f203753f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, zd70Var);
                return;
            } else {
                path.addPath(((ybn0) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f203751d;
    }
}
