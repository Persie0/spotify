package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p204p.ar40;
import p204p.gb80;
import p204p.hc80;
import p204p.p7u;
import p204p.q7u;
import p204p.r7u;
import p204p.rb5;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ar40 {
    @Override // p204p.ar40
    /* JADX INFO: renamed from: a */
    public final List mo594a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p204p.ar40
    /* JADX INFO: renamed from: b */
    public final Object mo595b(Context context) {
        Object objM75156x;
        r7u r7uVar = new r7u(context);
        if (p7u.f174764j == null) {
            synchronized (p7u.f174763i) {
                try {
                    if (p7u.f174764j == null) {
                        p7u.f174764j = new p7u(r7uVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        rb5 rb5VarM75141B = rb5.m75141B(context);
        rb5VarM75141B.getClass();
        synchronized (rb5.f197465f) {
            try {
                objM75156x = ((HashMap) rb5VarM75141B.f197471b).get(ProcessLifecycleInitializer.class);
                if (objM75156x == null) {
                    objM75156x = rb5VarM75141B.m75156x(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gb80 lifecycle = ((hc80) objM75156x).getLifecycle();
        lifecycle.mo31986a(new q7u(this, lifecycle));
        return Boolean.TRUE;
    }
}
