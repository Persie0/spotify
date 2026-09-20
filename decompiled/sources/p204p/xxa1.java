package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xxa1 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f266929a;

    /* JADX INFO: renamed from: b */
    public final boolean f266930b;

    /* JADX INFO: renamed from: c */
    public final Set f266931c = Collections.singleton(gn80.LISTENING_STATS);

    public xxa1(boolean z, boolean z2) {
        this.f266929a = z;
        this.f266930b = z2;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f266931c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return uxa1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        return new wxa1();
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "User Timeline (Listening Stats)";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f266929a && !this.f266930b;
    }
}
