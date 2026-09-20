package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes3.dex */
public final class sic1 implements ddl, vd50, rwf {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ sic1 f209396b = new sic1(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209397a;

    public /* synthetic */ sic1(int i) {
        this.f209397a = i;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        boe1 boe1Var;
        if (i == 0) {
            boe1Var = boe1.ALBUM;
        } else if (i == 1) {
            boe1Var = boe1.ARTIST;
        } else if (i == 2) {
            boe1Var = boe1.PLAYLIST;
        } else if (i == 3) {
            boe1Var = boe1.SHOW;
        } else if (i == 4) {
            boe1Var = boe1.BOOK;
        } else if (i == 5) {
            boe1Var = boe1.EVENT;
        } else if (i != 7) {
            switch (i) {
                case 100:
                    boe1Var = boe1.DOWNLOADED;
                    break;
                case 101:
                    boe1Var = boe1.WRITABLE;
                    break;
                case 102:
                    boe1Var = boe1.BY_YOU;
                    break;
                case 103:
                    boe1Var = boe1.BY_SPOTIFY;
                    break;
                case 104:
                    boe1Var = boe1.UNPLAYED;
                    break;
                case 105:
                    boe1Var = boe1.IN_PROGRESS;
                    break;
                case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                    boe1Var = boe1.FINISHED;
                    break;
                case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                    boe1Var = boe1.IS_MIXED;
                    break;
                case 108:
                    boe1Var = boe1.UPCOMING;
                    break;
                case 109:
                    boe1Var = boe1.VENUE;
                    break;
                case 110:
                    boe1Var = boe1.PAST;
                    break;
                case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                    boe1Var = boe1.FOLDER;
                    break;
                case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                    boe1Var = boe1.PUBLISHED;
                    break;
                case ContentType.LIVE /* 113 */:
                    boe1Var = boe1.PUBLISHABLE;
                    break;
                case 114:
                    boe1Var = boe1.BY_OTHERS;
                    break;
                default:
                    boe1Var = null;
                    break;
            }
        } else {
            boe1Var = boe1.AUTHOR;
        }
        return boe1Var == null ? boe1.UNRECOGNIZED : boe1Var;
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        switch (this.f209397a) {
            case 2:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(sef0Var);
            default:
                return new rb11((Context) sef0Var.mo54438a(Context.class));
        }
    }
}
