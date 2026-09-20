package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p204p.ar40;
import p204p.on3;
import p204p.sb20;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ar40 {
    @Override // p204p.ar40
    /* JADX INFO: renamed from: a */
    public final List mo594a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p204p.ar40
    /* JADX INFO: renamed from: b */
    public final Object mo595b(Context context) {
        Choreographer.getInstance().postFrameCallback(new sb20(this, context.getApplicationContext()));
        return new on3(22);
    }
}
