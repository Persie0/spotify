package p204p;

import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dj0 implements vhm0, kz8 {

    /* JADX INFO: renamed from: a */
    public float f49515a;

    /* JADX INFO: renamed from: b */
    public final Object f49516b;

    public dj0(GlueToolbar glueToolbar) {
        this.f49515a = -1.0f;
        this.f49516b = glueToolbar;
    }

    @Override // p204p.vhm0
    /* JADX INFO: renamed from: b */
    public int mo30690b(lv70 lv70Var, int i) {
        rha rhaVar = (rha) this.f49516b;
        float fM75510d = rhaVar.m75510d();
        zr51 zr51Var = lv70Var.f137253b;
        int iMo35990l0 = zr51Var.mo35990l0(fM75510d) - (zr51Var.mo35990l0(this.f49515a) * 2);
        int iMo35990l1 = zr51Var.mo35990l0(rhaVar.m75509c());
        return iMo35990l0 > iMo35990l1 ? iMo35990l1 : iMo35990l0;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: i */
    public boolean mo36142i(float f) {
        if (this.f49515a == f) {
            return true;
        }
        this.f49515a = f;
        return false;
    }

    @Override // p204p.kz8
    public boolean isEmpty() {
        return false;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: k */
    public wz60 mo36143k() {
        return (wz60) this.f49516b;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: l */
    public boolean mo36144l(float f) {
        return !((wz60) this.f49516b).m89400c();
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: m */
    public float mo36145m() {
        return ((wz60) this.f49516b).m89399b();
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: t */
    public float mo36146t() {
        return ((wz60) this.f49516b).m89398a();
    }

    public dj0(float f, fxh0 fxh0Var) {
        this.f49515a = f;
        this.f49516b = fxh0Var;
    }

    public dj0(rha rhaVar, float f) {
        this.f49516b = rhaVar;
        this.f49515a = f;
    }

    public dj0(List list) {
        this.f49515a = -1.0f;
        this.f49516b = (wz60) list.get(0);
    }
}
