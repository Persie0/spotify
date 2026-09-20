package p204p;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class a0b1 implements InterfaceC2207oa, a9f1 {

    /* JADX INFO: renamed from: a */
    public static a0b1 f11044a;

    /* JADX INFO: renamed from: a */
    public static void m24338a() {
        if (f11044a == null) {
            f11044a = new a0b1();
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return h6f.m46715L(u300.WRAPPED_2023_TOP_100, u300.WRAPPED_2024_TOP_100, u300.WRAPPED_2025_TOP_100, u300.WRAPPED_2026_TOP_100, u300.MUSIC_EVOLUTION).contains(((ihi) obj).f102296c);
    }

    @Override // p204p.a9f1
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo24339b(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
