package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ips implements jps {

    /* JADX INFO: renamed from: a */
    public final String f104549a;

    public ips(String str) {
        this.f104549a = str;
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: a */
    public final int mo48179a() {
        return R.string.external_integration_playback_failed;
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: b */
    public final int mo48180b() {
        return 109;
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: c */
    public final boolean mo48181c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ips) && wj50.m88271j(this.f104549a, ((ips) obj).f104549a);
    }

    public final int hashCode() {
        return this.f104549a.hashCode();
    }
}
