package p204p;

import android.graphics.Rect;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lz8 implements kz8 {

    /* JADX INFO: renamed from: a */
    public float f138283a;

    /* JADX INFO: renamed from: b */
    public final Object f138284b;

    /* JADX INFO: renamed from: c */
    public Object f138285c;

    /* JADX INFO: renamed from: d */
    public Object f138286d;

    public lz8(List list) {
        this.f138286d = null;
        this.f138283a = -1.0f;
        this.f138284b = list;
        this.f138285c = m60293a(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public wz60 m60293a(float f) {
        List list = (List) this.f138284b;
        wz60 wz60Var = (wz60) list.get(list.size() - 1);
        if (f >= wz60Var.m89399b()) {
            return wz60Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            wz60 wz60Var2 = (wz60) list.get(size);
            if (((wz60) this.f138285c) != wz60Var2 && f >= wz60Var2.m89399b() && f < wz60Var2.m89398a()) {
                return wz60Var2;
            }
        }
        return (wz60) list.get(0);
    }

    /* JADX INFO: renamed from: b */
    public void m60294b(float f) {
        this.f138283a = f;
        if (f < 0.0f) {
            this.f138283a = 0.0f;
        }
        if (this.f138283a > 1.0f) {
            this.f138283a = 1.0f;
        }
        ((Rect) this.f138285c).offsetTo(0, Math.round((((Rect) this.f138284b).height() - ((RecyclerViewFastScroller) this.f138286d).f5087c) * this.f138283a));
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: i */
    public boolean mo36142i(float f) {
        wz60 wz60Var = (wz60) this.f138286d;
        wz60 wz60Var2 = (wz60) this.f138285c;
        if (wz60Var == wz60Var2 && this.f138283a == f) {
            return true;
        }
        this.f138286d = wz60Var2;
        this.f138283a = f;
        return false;
    }

    @Override // p204p.kz8
    public boolean isEmpty() {
        return false;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: k */
    public wz60 mo36143k() {
        return (wz60) this.f138285c;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: l */
    public boolean mo36144l(float f) {
        wz60 wz60Var = (wz60) this.f138285c;
        if (f >= wz60Var.m89399b() && f < wz60Var.m89398a()) {
            return !((wz60) this.f138285c).m89400c();
        }
        this.f138285c = m60293a(f);
        return true;
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: m */
    public float mo36145m() {
        return ((wz60) ((List) this.f138284b).get(0)).m89399b();
    }

    @Override // p204p.kz8
    /* JADX INFO: renamed from: t */
    public float mo36146t() {
        List list = (List) this.f138284b;
        return ((wz60) list.get(list.size() - 1)).m89398a();
    }

    public lz8(RecyclerViewFastScroller recyclerViewFastScroller) {
        this.f138286d = recyclerViewFastScroller;
        this.f138284b = new Rect();
        this.f138285c = new Rect();
    }
}
