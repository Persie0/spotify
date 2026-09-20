package p204p;

import android.os.Bundle;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class fdc implements hr91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68456a;

    /* JADX INFO: renamed from: b */
    public final cdc f68457b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f68458c;

    public /* synthetic */ fdc(cdc cdcVar, LinearLayout linearLayout, int i) {
        this.f68456a = i;
        this.f68457b = cdcVar;
        this.f68458c = linearLayout;
    }

    @Override // p204p.hr91
    public final Object getView() {
        switch (this.f68456a) {
            case 0:
                break;
        }
        return this.f68458c;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        switch (this.f68456a) {
            case 0:
                return new Bundle();
            default:
                return pp91.m70528i();
        }
    }

    @Override // p204p.hr91
    public final void start() {
        switch (this.f68456a) {
            case 0:
                this.f68457b.start();
                break;
            default:
                this.f68457b.start();
                break;
        }
    }

    @Override // p204p.hr91
    public final void stop() {
        switch (this.f68456a) {
            case 0:
                this.f68457b.stop();
                break;
            default:
                this.f68457b.stop();
                break;
        }
    }
}
