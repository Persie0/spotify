package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class aml0 implements ycj0, pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f17156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f17157c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f17158d;

    public /* synthetic */ aml0(Object obj, int i) {
        this.f17155a = i;
        this.f17158d = obj;
        this.f17156b = obj;
        this.f17157c = obj;
    }

    @Override // p204p.ycj0
    /* JADX INFO: renamed from: c */
    public final av91 mo26427c() {
        switch (this.f17155a) {
            case 0:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "bluetoothpermission:acquisitionsheet:open_native_permission_dialog")), ((sag0) this.f17158d).f207208b, st91.f213865b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", "bluetoothpermission:acquisitionsheet:go_to_settings")), ((sag0) this.f17158d).f207208b, st91.f213865b, System.currentTimeMillis());
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        switch (this.f17155a) {
            case 0:
                break;
        }
        return ((sag0) this.f17156b).mo24361d();
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f17155a) {
            case 0:
                break;
        }
        return ((sag0) this.f17157c).mo24514e();
    }
}
