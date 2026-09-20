package p204p;

import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kw6 implements jw6 {

    /* JADX INFO: renamed from: a */
    public final AudioDeviceInfo f127013a;

    public kw6(AudioDeviceInfo audioDeviceInfo) {
        this.f127013a = audioDeviceInfo;
    }

    @Override // p204p.jw6
    /* JADX INFO: renamed from: a */
    public final String mo54405a() {
        return this.f127013a.getAddress();
    }

    @Override // p204p.jw6
    /* JADX INFO: renamed from: b */
    public final CharSequence mo54406b() {
        return this.f127013a.getProductName();
    }

    @Override // p204p.jw6
    public final int getId() {
        return this.f127013a.getId();
    }

    @Override // p204p.jw6
    public final int getType() {
        return this.f127013a.getType();
    }
}
