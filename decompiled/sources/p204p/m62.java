package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m62 implements ogm0 {

    /* JADX INFO: renamed from: b */
    public static final voc1 f140337b;

    /* JADX INFO: renamed from: a */
    public final Set f140338a = Collections.singleton(gn80.AGE_ASSURANCE);

    static {
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        f140337b = mug1.m62869n("spotify:age-assurance");
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f140338a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return j62.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Object objM70538s = pp91.m70538s(intent, "age_assurance_type", k92.class);
        wj50.m88279p(objM70538s);
        return new l62((k92) objM70538s, (Intent) pp91.m70538s(intent, "on_age_assurance_complete_intent", Intent.class));
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(false);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Age Assurance flow to let users verify their age.";
    }
}
