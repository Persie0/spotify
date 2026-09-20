package p204p;

import android.content.Context;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public interface mv1 {
    sv1 newSessionBuilder(xv1 xv1Var);

    void registerMeetingStatusListener(Context context, c8e0 c8e0Var, Optional optional);

    void unregisterMeetingStatusListener(Context context);
}
