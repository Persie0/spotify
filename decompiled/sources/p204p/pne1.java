package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pne1 {
    /* JADX INFO: renamed from: a */
    public static boolean m70445a(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
            return true;
        }
        Set set = dd41.f47702f;
        gn80 gn80Var = r46.m74726U(str).f47709c;
        return gn80Var == gn80.COLLECTION_YOUR_EPISODES || gn80Var == gn80.COLLECTION_YOUR_EPISODES_CORE || gn80Var == gn80.COLLECTION_LISTENLATER_EPISODES;
    }
}
