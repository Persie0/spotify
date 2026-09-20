package p204p;

import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class p7u {

    /* JADX INFO: renamed from: i */
    public static final Object f174763i = new Object();

    /* JADX INFO: renamed from: j */
    public static volatile p7u f174764j;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f174765a;

    /* JADX INFO: renamed from: b */
    public final zj5 f174766b;

    /* JADX INFO: renamed from: c */
    public volatile int f174767c;

    /* JADX INFO: renamed from: d */
    public final j7u f174768d;

    /* JADX INFO: renamed from: e */
    public final o7u f174769e;

    /* JADX INFO: renamed from: f */
    public final hp3 f174770f;

    /* JADX INFO: renamed from: g */
    public final int f174771g;

    /* JADX INFO: renamed from: h */
    public final tip f174772h;

    public p7u(r7u r7uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f174765a = reentrantReadWriteLock;
        this.f174767c = 3;
        o7u o7uVar = r7uVar.f120194a;
        this.f174769e = o7uVar;
        int i = r7uVar.f120195b;
        this.f174771g = i;
        this.f174772h = r7uVar.f120196c;
        this.f174766b = new zj5(0);
        this.f174770f = new hp3();
        j7u j7uVar = new j7u(this);
        this.f174768d = j7uVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f174767c = 0;
            } catch (Throwable th) {
                this.f174765a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m69300c() == 0) {
            try {
                o7uVar.mo66404a(new i7u(j7uVar));
            } catch (Throwable th2) {
                m69303g(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static p7u m69297a() {
        p7u p7uVar;
        synchronized (f174763i) {
            p7uVar = f174764j;
            wj50.m88281r("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", p7uVar != null);
        }
        return p7uVar;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m69298d() {
        return f174764j != null;
    }

    /* JADX INFO: renamed from: b */
    public final int m69299b(int i, CharSequence charSequence) {
        wj50.m88281r("Not initialized yet", m69301e());
        wj50.m88280q(charSequence, "charSequence cannot be null");
        return this.f174768d.f109664a.m91984n(i, charSequence);
    }

    /* JADX INFO: renamed from: c */
    public final int m69300c() {
        this.f174765a.readLock().lock();
        try {
            return this.f174767c;
        } finally {
            this.f174765a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m69301e() {
        return m69300c() == 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m69302f() {
        wj50.m88281r("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f174771g == 1);
        if (m69301e()) {
            return;
        }
        this.f174765a.writeLock().lock();
        try {
            if (this.f174767c == 0) {
                this.f174765a.writeLock().unlock();
                return;
            }
            this.f174767c = 0;
            this.f174765a.writeLock().unlock();
            j7u j7uVar = this.f174768d;
            p7u p7uVar = j7uVar.f109666c;
            try {
                p7uVar.f174769e.mo66404a(new i7u(j7uVar));
            } catch (Throwable th) {
                p7uVar.m69303g(th);
            }
        } catch (Throwable th2) {
            this.f174765a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m69303g(Throwable th) {
        zj5 zj5Var = this.f174766b;
        ArrayList arrayList = new ArrayList(zj5Var.f283362c);
        this.f174765a.writeLock().lock();
        try {
            this.f174767c = 2;
            arrayList.addAll(zj5Var);
            zj5Var.clear();
            this.f174765a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ((n7u) arrayList.get(i)).m63812a(th);
            }
        } catch (Throwable th2) {
            this.f174765a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m69304h(int i, int i2, int i3, CharSequence charSequence) {
        wj50.m88281r("Not initialized yet", m69301e());
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        wj50.m88275l("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        wj50.m88275l("start should be < than charSequence length", i <= charSequence.length());
        wj50.m88275l("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.f174768d.f109664a.m91992x(charSequence, i, i2, i3 == 1);
    }

    /* JADX INFO: renamed from: i */
    public final void m69305i(z96 z96Var) {
        Handler handlerM31819K = c95.m31819K();
        Objects.requireNonNull(handlerM31819K);
        xgi xgiVar = new xgi(handlerM31819K, 0);
        wj50.m88280q(z96Var, "initCallback cannot be null");
        n7u n7uVar = new n7u(xgiVar, z96Var);
        this.f174765a.writeLock().lock();
        try {
            if (this.f174767c == 1) {
                n7uVar.m63813b();
            } else if (this.f174767c == 2) {
                n7uVar.m63812a(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.f174766b.add(n7uVar);
            }
        } finally {
            this.f174765a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m69306j(EditorInfo editorInfo) {
        if (!m69301e() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        j7u j7uVar = this.f174768d;
        j7uVar.getClass();
        Bundle bundle = editorInfo.extras;
        m7f0 m7f0Var = (m7f0) j7uVar.f109665b.f258037b;
        int iM83534a = m7f0Var.m83534a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM83534a != 0 ? m7f0Var.f232071b.getInt(iM83534a + m7f0Var.f232070a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
