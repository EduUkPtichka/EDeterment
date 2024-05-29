import SwiftUI
import shared

struct AuthPhoneNumber: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        return AuthPreviewIosPhoneNumber()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
        
    }
}

