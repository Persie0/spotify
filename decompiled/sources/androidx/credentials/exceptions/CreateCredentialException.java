package androidx.credentials.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public abstract class CreateCredentialException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f821a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f822b;

    public CreateCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.f821a = str;
        this.f822b = charSequence;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF821a() {
        return this.f821a;
    }
}
