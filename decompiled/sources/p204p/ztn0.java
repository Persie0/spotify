package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class ztn0 implements sjx0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f286227a;

    /* JADX INFO: renamed from: b */
    public final y2y0 f286228b;

    public ztn0(i4t0 i4t0Var, y2y0 y2y0Var) {
        this.f286227a = i4t0Var;
        this.f286228b = y2y0Var;
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: a */
    public final boolean mo48695a(roa roaVar) {
        ExternalAccessoryDescription externalAccessoryDescriptionM76032b = roaVar.m76032b();
        boolean zEquals = "com.google.android.deskclock".equals(externalAccessoryDescriptionM76032b != null ? externalAccessoryDescriptionM76032b.senderId : null);
        ExternalAccessoryDescription externalAccessoryDescriptionM76032b2 = roaVar.m76032b();
        boolean zEquals2 = "partner_ui".equals(externalAccessoryDescriptionM76032b2 != null ? externalAccessoryDescriptionM76032b2.integrationType : null);
        ExternalAccessoryDescription externalAccessoryDescriptionM76032b3 = roaVar.m76032b();
        return (roaVar.m76042l() && (zEquals2 || zEquals || "app_remote".equals(externalAccessoryDescriptionM76032b3 != null ? externalAccessoryDescriptionM76032b3.integrationType : null))) || (bm51.m29803n0(roaVar.m76035e(), "spotify:section:", false) && !this.f286228b.mo48695a(roaVar));
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: b */
    public final l8d0 mo48696b() {
        return (l8d0) this.f286227a.get();
    }
}
