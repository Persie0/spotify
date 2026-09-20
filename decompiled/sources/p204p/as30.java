package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: classes7.dex */
public final class as30 {
    /* JADX INFO: renamed from: a */
    public static ds30 m27054a(String str, String str2, wj30 wj30Var) {
        HubsImmutableComponentBundle.Companion.getClass();
        return new ds30(str, str2, br30.m30289e(wj30Var));
    }

    /* JADX INFO: renamed from: b */
    public static ds30 m27055b(wq30 wq30Var) {
        return wq30Var instanceof ds30 ? (ds30) wq30Var : m27054a(wq30Var.uri(), wq30Var.placeholder(), wq30Var.custom());
    }
}
