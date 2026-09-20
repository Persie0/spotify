package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: classes3.dex */
public final class m9s implements wsa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141377a;

    /* JADX INFO: renamed from: b */
    public final ata0 f141378b;

    public m9s(int i) {
        this.f141377a = i;
        switch (i) {
            case 1:
                this.f141378b = ata0.f19627b;
                break;
            default:
                this.f141378b = ata0.f19627b;
                break;
        }
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Connectable mo24834a() {
        switch (this.f141377a) {
        }
        return null;
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: b */
    public final Update mo24835b() {
        switch (this.f141377a) {
            case 0:
                break;
        }
        return this.f141378b;
    }
}
