package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class on31 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final el31 f167152a;

    /* JADX INFO: renamed from: b */
    public final Set f167153b;

    public on31(el31 el31Var) {
        this.f167152a = el31Var;
        this.f167153b = el31Var.f60575a ? Collections.singleton(gn80.SONG_DNA) : new LinkedHashSet();
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f167153b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return vm31.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Bundle extras;
        String strM35720r = dd41Var.m35720r();
        String strM35694A = dd41Var.m35694A();
        if (strM35694A == null) {
            strM35694A = "";
        }
        Long lValueOf = null;
        if (intent.hasExtra("extra_background_color") && (extras = intent.getExtras()) != null) {
            lValueOf = Long.valueOf(extras.getLong("extra_background_color"));
        }
        return new mn31(lValueOf, strM35720r, strM35694A);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Song dna page";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f167152a.f60575a;
    }
}
