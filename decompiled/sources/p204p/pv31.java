package p204p;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class pv31 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SharedPreferences f181590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f181591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv31(SharedPreferences sharedPreferences, String str, int i) {
        super(0);
        this.f181589a = i;
        this.f181590b = sharedPreferences;
        this.f181591c = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f181589a) {
            case 0:
                String string = this.f181590b.getString(this.f181591c, "");
                wj50.m88279p(string);
                return string;
            default:
                Set<String> stringSet = this.f181590b.getStringSet(this.f181591c, gbu.f78413a);
                wj50.m88279p(stringSet);
                return stringSet;
        }
    }
}
