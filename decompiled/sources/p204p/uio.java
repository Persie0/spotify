package p204p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface uio extends fho {
    /* JADX INFO: renamed from: a */
    void mo29278a(x491 x491Var);

    void close();

    /* JADX INFO: renamed from: e */
    default Map mo28172e() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    /* JADX INFO: renamed from: u */
    long mo28175u(sjo sjoVar);
}
