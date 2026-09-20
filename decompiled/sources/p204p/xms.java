package p204p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public class xms extends ge10 {

    /* JADX INFO: renamed from: k */
    public static final sgq0 f263436k = new sgq0("dynamicnpvwidget_state_key");

    /* JADX INFO: renamed from: b */
    public final float f263437b;

    /* JADX INFO: renamed from: c */
    public final String f263438c;

    /* JADX INFO: renamed from: d */
    public final String f263439d;

    /* JADX INFO: renamed from: e */
    public final xz10 f263440e;

    /* JADX INFO: renamed from: f */
    public final boolean f263441f;

    /* JADX INFO: renamed from: g */
    public final boolean f263442g;

    /* JADX INFO: renamed from: h */
    public final Object f263443h;

    /* JADX INFO: renamed from: i */
    public final ni21 f263444i;

    /* JADX INFO: renamed from: j */
    public final zzx0 f263445j;

    public xms(float f, String str, String str2, eh00 eh00Var, int i) {
        this((i & 1) != 0 ? 0 : f, str, str2, xz10.f267505a, false, (i & 32) != 0, eh00Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static void m91473g(xms xmsVar, ie5 ie5Var, ibk ibkVar) {
        vms vmsVar;
        if (ibkVar instanceof vms) {
            vmsVar = (vms) ibkVar;
            int i = vmsVar.f242926c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmsVar.f242926c = i - Integer.MIN_VALUE;
            } else {
                vmsVar = new vms(xmsVar, ibkVar);
            }
        } else {
            vmsVar = new vms(xmsVar, ibkVar);
        }
        Object obj = vmsVar.f242924a;
        int i2 = vmsVar.f242926c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        fyf fyfVar = new fyf(new wms(ie5Var, xmsVar), true, 1594431723);
        vmsVar.f242926c = 1;
        tqg1.m81326n(fyfVar, vmsVar);
    }

    @Override // p204p.ge10
    /* JADX INFO: renamed from: b */
    public final ni21 mo44446b() {
        return this.f263444i;
    }

    @Override // p204p.ge10
    /* JADX INFO: renamed from: c */
    public final zzx0 mo44447c() {
        return this.f263445j;
    }

    @Override // p204p.ge10
    /* JADX INFO: renamed from: d */
    public void mo44448d(Context context, ie5 ie5Var, fbk fbkVar) {
        m91473g(this, ie5Var, (ibk) fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088 A[PHI: r1
      0x0088: PHI (r1v18 java.lang.String) = (r1v15 java.lang.String), (r1v20 java.lang.String) binds: [B:52:0x0094, B:45:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, p.eh00] */
    /* JADX INFO: renamed from: f */
    public final void m91474f(WidgetState widgetState, String str, String str2, xq00 xq00Var, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        boolean zM91770i;
        int i5;
        int i6;
        pgv0 pgv0VarM91796v;
        String str5;
        String widgetCategory;
        xq00Var.m91775k0(1125147919);
        int i7 = (xq00Var.m91770i(widgetState) ? 4 : 2) | i;
        if ((i2 & 2) == 0) {
            str3 = str;
            int i8 = xq00Var.m91766g(str3) ? 32 : 16;
            i3 = i7 | i8;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    str4 = str2;
                    int i9 = xq00Var.m91766g(str4) ? 256 : 128;
                    i3 |= i9;
                } else {
                    str4 = str2;
                }
                i3 |= i9;
            } else {
                str4 = str2;
            }
            if (xq00Var.m91768h(false)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            int i10 = i3 | i4;
            if ((32768 & i) == 0) {
                zM91770i = xq00Var.m91766g(this);
            } else {
                zM91770i = xq00Var.m91770i(this);
            }
            if (zM91770i) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i10 | i5;
            if (xq00Var.m91752Y(i6 & 1, (i6 & 9363) != 9362)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if ((i2 & 2) != 0) {
                        str5 = this.f263438c;
                    } else {
                        str5 = str3;
                    }
                    if ((i2 & 4) != 0) {
                        widgetCategory = widgetState.getWidgetCategory();
                    }
                    xq00Var.m91790s();
                    qqg1.m73533c(new c4t0[]{vsh.f244438a.mo30068a(this.f263443h.invoke()), htd1.f94988a.mo30068a(widgetCategory), htd1.f94989b.mo30068a(str5), htd1.f94990c.mo30068a(this.f263439d), vsh.f244439b.mo30068a(new ybs(this.f263437b)), vsh.f244440c.mo30068a(this.f263440e), vsh.f244441d.mo30068a(Boolean.valueOf(this.f263441f))}, rkk.m75772x(422947279, new apl(28, widgetState, this), xq00Var), xq00Var, 56);
                    str4 = widgetCategory;
                    str3 = str5;
                } else {
                    xq00Var.m91757b0();
                    str5 = str3;
                }
                widgetCategory = str4;
                xq00Var.m91790s();
                qqg1.m73533c(new c4t0[]{vsh.f244438a.mo30068a(this.f263443h.invoke()), htd1.f94988a.mo30068a(widgetCategory), htd1.f94989b.mo30068a(str5), htd1.f94990c.mo30068a(this.f263439d), vsh.f244439b.mo30068a(new ybs(this.f263437b)), vsh.f244440c.mo30068a(this.f263440e), vsh.f244441d.mo30068a(Boolean.valueOf(this.f263441f))}, rkk.m75772x(422947279, new apl(28, widgetState, this), xq00Var), xq00Var, 56);
                str4 = widgetCategory;
                str3 = str5;
            } else {
                xq00Var.m91757b0();
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gj0(this, widgetState, str3, str4, i, i2, 16);
            }
        }
        str3 = str;
        i3 = i7 | i8;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str2;
                if (xq00Var.m91766g(str4)) {
                }
                i3 |= i9;
            } else {
                str4 = str2;
            }
            i3 |= i9;
        } else {
            str4 = str2;
        }
        if (xq00Var.m91768h(false)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i11 = i3 | i4;
        if ((32768 & i) == 0) {
            zM91770i = xq00Var.m91766g(this);
        } else {
            zM91770i = xq00Var.m91770i(this);
        }
        if (zM91770i) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        i6 = i11 | i5;
        if (xq00Var.m91752Y(i6 & 1, (i6 & 9363) != 9362)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    str5 = this.f263438c;
                } else {
                    str5 = str3;
                }
                if ((i2 & 4) != 0) {
                    widgetCategory = widgetState.getWidgetCategory();
                } else {
                    widgetCategory = str4;
                }
            } else {
                if ((i2 & 2) != 0) {
                    str5 = this.f263438c;
                } else {
                    str5 = str3;
                }
                if ((i2 & 4) != 0) {
                    widgetCategory = widgetState.getWidgetCategory();
                } else {
                    widgetCategory = str4;
                }
            }
            xq00Var.m91790s();
            qqg1.m73533c(new c4t0[]{vsh.f244438a.mo30068a(this.f263443h.invoke()), htd1.f94988a.mo30068a(widgetCategory), htd1.f94989b.mo30068a(str5), htd1.f94990c.mo30068a(this.f263439d), vsh.f244439b.mo30068a(new ybs(this.f263437b)), vsh.f244440c.mo30068a(this.f263440e), vsh.f244441d.mo30068a(Boolean.valueOf(this.f263441f))}, rkk.m75772x(422947279, new apl(28, widgetState, this), xq00Var), xq00Var, 56);
            str4 = widgetCategory;
            str3 = str5;
        } else {
            xq00Var.m91757b0();
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gj0(this, widgetState, str3, str4, i, i2, 16);
        }
    }

    public xms(float f, String str, String str2, xz10 xz10Var, boolean z, boolean z2, eh00 eh00Var) {
        this.f263437b = f;
        this.f263438c = str;
        this.f263439d = str2;
        this.f263440e = xz10Var;
        this.f263441f = z;
        this.f263442g = z2;
        this.f263443h = eh00Var;
        this.f263444i = ni21.f154165a;
        this.f263445j = zzx0.f288153a;
    }
}
