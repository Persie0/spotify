package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mkd1 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f144556a = Collections.singleton(pkd1.f178447d);

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return jkd1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        return new lkd1();
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(false);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return this.f144556a;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "A bottom sheet upsell shown when a Wear OS user tries to download.";
    }
}
