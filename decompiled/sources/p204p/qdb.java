package p204p;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qdb {
    /* JADX INFO: renamed from: a */
    public static np7 m72590a(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new np7(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
