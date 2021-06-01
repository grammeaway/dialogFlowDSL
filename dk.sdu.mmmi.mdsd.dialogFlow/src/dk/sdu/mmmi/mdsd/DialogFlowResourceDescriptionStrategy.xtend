package dk.sdu.mmmi.mdsd

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName

class DialogFlowResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy{
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if(eObject instanceof DialogFlowSystem) {
			acceptor.accept(EObjectDescription.create(QualifiedName.create(eObject.name), eObject))
			return true
		}
		else {
			super.createEObjectDescriptions(eObject, acceptor)
		}
	}
}