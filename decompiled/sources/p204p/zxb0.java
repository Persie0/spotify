package p204p;

import android.view.ViewGroup;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class zxb0 {

    /* JADX INFO: renamed from: a */
    public final MainLayout f287270a;

    /* JADX INFO: renamed from: b */
    public final wg61 f287271b = new wg61(new vmb0(this, 7));

    /* JADX INFO: renamed from: c */
    public final xxb0 f287272c = new xxb0(new wxb0(false, false, false), this);

    /* JADX INFO: renamed from: d */
    public final xxb0 f287273d = new xxb0(this, 1);

    /* JADX INFO: renamed from: e */
    public final xxb0 f287274e = new xxb0(this, 2);

    /* JADX INFO: renamed from: f */
    public final xxb0 f287275f = new xxb0(this);

    /* JADX INFO: renamed from: g */
    public boolean f287276g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f287269i = {new spi0(zxb0.class, "overlayMode", "getOverlayMode()Lcom/spotify/mainlayout/ui/view/overlay/MainLayoutOverlayManager$OverlayMode;", 0), new spi0(zxb0.class, "presentationMode", "getPresentationMode()Lcom/spotify/navigation/presentation/PresentationMode;", 0), new spi0(zxb0.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0), new spi0(zxb0.class, "isOverlayTouchPassthroughActive", "isOverlayTouchPassthroughActive()Z", 0)};

    /* JADX INFO: renamed from: h */
    public static final oh5 f287268h = new oh5();

    public zxb0(MainLayout mainLayout) {
        this.f287270a = mainLayout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: a */
    public static final void m97173a(zxb0 zxb0Var) {
        boolean z;
        ViewGroup fragmentOverlayContainer = zxb0Var.f287270a.getFragmentOverlayContainer();
        if (zxb0Var.m97176c().f255999a) {
            xxb0 xxb0Var = zxb0Var.f287275f;
            qr60 qr60Var = f287269i[3];
            if (((Boolean) xxb0Var.f61172a).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        fragmentOverlayContainer.setClickable(z);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX INFO: renamed from: b */
    public static final void m97174b(zxb0 zxb0Var) {
        boolean z;
        boolean z2;
        int iOrdinal = zxb0Var.f287270a.getMode().ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        } else {
            z = false;
        }
        qr60[] qr60VarArr = f287269i;
        if (z) {
            xxb0 xxb0Var = zxb0Var.f287274e;
            qr60 qr60Var = qr60VarArr[2];
            tkm0 tkm0Var = (tkm0) xxb0Var.f61172a;
            if (wj50.m88271j(tkm0Var != null ? tkm0Var.f221184a : null, rkm0.f200124a)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z3 = zxb0Var.m97177d() instanceof yzq0;
        boolean z4 = z3 && !z2;
        zxb0Var.f287272c.m39516c(qr60VarArr[0], zxb0Var, new wxb0(z3, z4, z ? z4 : z3));
    }

    /* JADX INFO: renamed from: e */
    public static final void m97175e(ViewGroup viewGroup, boolean z) {
        viewGroup.setImportantForAccessibility(z ? 4 : 1);
        viewGroup.setDescendantFocusability(z ? 393216 : 262144);
    }

    /* JADX INFO: renamed from: c */
    public final wxb0 m97176c() {
        qr60 qr60Var = f287269i[0];
        return (wxb0) this.f287272c.f61172a;
    }

    /* JADX INFO: renamed from: d */
    public final zzq0 m97177d() {
        qr60 qr60Var = f287269i[1];
        return (zzq0) this.f287273d.f61172a;
    }
}
