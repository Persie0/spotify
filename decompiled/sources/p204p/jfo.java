package p204p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class jfo extends sdv implements d7x0 {

    /* JADX INFO: renamed from: d */
    public final Status f111946d;

    public jfo(DataHolder dataHolder) {
        super(dataHolder);
        this.f111946d = new Status(dataHolder.f1865e, null, null, null);
    }

    @Override // p204p.sdv
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo53203a(int i, int i2) {
        return new gsf1(this.f208088a, i, i2);
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f111946d;
    }
}
