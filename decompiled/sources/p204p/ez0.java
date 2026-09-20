package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ez0 {
    /* JADX INFO: renamed from: a */
    public static final String m40327a(w0b0 w0b0Var) {
        if (w0b0Var instanceof q0b0) {
            return "OneTimeToken";
        }
        if (w0b0Var instanceof s0b0) {
            return "Passkey";
        }
        if (w0b0Var instanceof v0b0) {
            return "UsernamePassword";
        }
        if (w0b0Var instanceof k0b0) {
            return "Facebook";
        }
        if (w0b0Var instanceof m0b0) {
            return "Google";
        }
        if (w0b0Var instanceof i0b0) {
            return "EmailSignup";
        }
        if (w0b0Var instanceof j0b0) {
            return "EmailSignupWithCredentials";
        }
        if (w0b0Var instanceof n0b0) {
            return "GraduationEmailSignup";
        }
        if (w0b0Var instanceof u0b0) {
            return "Samsung";
        }
        if (w0b0Var instanceof p0b0) {
            return "Naver";
        }
        if (w0b0Var instanceof t0b0) {
            return "PhoneNumber";
        }
        if (w0b0Var instanceof o0b0) {
            return "Identityless";
        }
        if (w0b0Var instanceof r0b0) {
            return "ParentChild";
        }
        if (w0b0Var instanceof h0b0) {
            return "EmailPassword";
        }
        if (w0b0Var instanceof f0b0) {
            return "EmailOtp";
        }
        if (w0b0Var instanceof g0b0) {
            return "EmailOtpSignup";
        }
        throw new NoWhenBranchMatchedException();
    }
}
