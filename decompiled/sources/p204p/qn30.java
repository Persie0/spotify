package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: classes7.dex */
public enum qn30 {
    DEFAULT("default", wzb.f256550a),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_LINE_TITLE("doubleLineTitle", wzb.f256551b),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_LINE_SUBTITLE("doubleLineSubtitle", wzb.f256552c);


    /* JADX INFO: renamed from: a */
    public final String f190464a;

    /* JADX INFO: renamed from: b */
    public final wzb f190465b;

    qn30(String str, wzb wzbVar) {
        this.f190464a = str;
        this.f190465b = wzbVar;
        HubsImmutableComponentBundle.Companion.getClass();
        br30.m30287c().mo33717r("textLayout", str).mo33703d();
    }
}
