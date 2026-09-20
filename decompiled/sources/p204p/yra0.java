package p204p;

import android.app.ApplicationExitInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yra0 implements t95 {
    @Override // p204p.t95
    /* JADX INFO: renamed from: a */
    public final void mo47858a(ApplicationExitInfo applicationExitInfo) {
        String string = applicationExitInfo.toString();
        bga.m29094p(4000, 4000);
        int length = string.length();
        ArrayList arrayList = new ArrayList((length / 4000) + (length % 4000 == 0 ? 0 : 1));
        for (int i = 0; i >= 0 && i < length; i += 4000) {
            int i2 = i + 4000;
            if (i2 < 0 || i2 > length) {
                i2 = length;
            }
            string.subSequence(i, i2).toString();
            arrayList.add(w2a1.f247311a);
        }
    }
}
