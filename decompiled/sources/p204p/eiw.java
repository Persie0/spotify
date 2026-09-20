package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum eiw implements od50 {
    success(0),
    aborted(1),
    unsupportedResponse(2),
    nonSuccessfulResponse(3),
    httpTransportError(4),
    unsupportedAuthenticationMethod(5),
    invalidArguments(6),
    unknownBackendError(7),
    invalidCredentials(8),
    badRequest(9),
    unsupportedLoginProtocol(10),
    timeout(11),
    unknownIdentifier(12),
    tooManyAttempts(13),
    invalidPhoneNumber(14),
    tryAgainLater(15),
    hashMismatch(16),
    notAllowed(17),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f60039a;

    eiw(int i) {
        this.f60039a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f60039a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
