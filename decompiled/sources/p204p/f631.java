package p204p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.p184v1.SnackbarMessageComponent;

/* JADX INFO: loaded from: classes11.dex */
public final class f631 implements fwf {

    /* JADX INFO: renamed from: a */
    public final i4t0 f66252a;

    public f631(h4t0 h4t0Var) {
        this.f66252a = h4t0Var;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: a */
    public final vwf mo32629a(Any any) {
        SnackbarMessageComponent snackbarMessageComponentM22713r = SnackbarMessageComponent.m22713r(any.m1913r());
        return new f931(snackbarMessageComponentM22713r.m22716p(), snackbarMessageComponentM22713r.m22715o(), snackbarMessageComponentM22713r.m22717q() ? new e931(snackbarMessageComponentM22713r.m22714n().m22721q(), snackbarMessageComponentM22713r.m22714n().m22720p(), snackbarMessageComponentM22713r.m22714n().m22719n()) : null);
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: b */
    public final Class mo32630b() {
        return f931.class;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: c */
    public final kxf mo32631c() {
        return (kxf) this.f66252a.get();
    }
}
